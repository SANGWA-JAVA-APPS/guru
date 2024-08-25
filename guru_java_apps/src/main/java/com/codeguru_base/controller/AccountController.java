package com.codeguru_base.controller;

import com.codeguru_base.dto.ChangePassword;
import com.codeguru_base.dto.CustomErrorMessage;
import com.codeguru_base.dto.UsersDTO;
import com.codeguru_base.exception.ResourceNotFoundException;
import com.codeguru_base.jwtsecurity.User;
import com.codeguru_base.models.Mdl_account_category;
import com.codeguru_base.models.Mdl_profile;
import com.codeguru_base.models.UserDetailsResponse;
import com.codeguru_base.repo.AccountRepository;
import com.codeguru_base.repo.Account_categoryRepository;
import com.codeguru_base.repo.ProfileRepository;
import com.codeguru_base.repo.UserRepository;
import com.users.dto.Dto_updatePassword;
import io.swagger.v3.oas.annotations.Operation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@RestController
@RequestMapping("/guru/api/account")
@Slf4j
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    Account_categoryRepository account_categoryRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    UserRepository userRepository;

    @Operation(summary = "Getting all the Account only")
    @GetMapping("/")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = new ArrayList<>();
        accountRepository.findAll().forEach(users::add);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity< User> getAccountById(@PathVariable("id") long id) {
        User user = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("account not exist with id:" + id));;
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/disableOrEnable/users/byStatus/{status}/{id}")
    public User changeStatus(@PathVariable String status, @PathVariable long id) {
        User account = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("account not exist with id:" + id));
        account.setStatus(status);
        accountRepository.save(account);
        return account;
    }
    //get account  by id

    @GetMapping("/users/byStatus/{status}")
    public List<UserDetailsResponse> getAccountByStatus(@PathVariable String status) {
        return accountRepository.findUserAndProfileByStatus(status);
    }

    @Operation(summary = "Creating a user account")
    @PostMapping()
    public ResponseEntity<String> addAccounts(@RequestBody UsersDTO usersDTO) {
        //Save category as admin
        System.out.println("----------------------------- WE are creatint an account");
        profileRepository.saveAndFlush(new Mdl_profile(usersDTO.getName(), usersDTO.getSurname(), usersDTO.getGender()));
        Mdl_profile mdl_profile = profileRepository.findLastProfile();

        //-------------------save account----------------------
        Mdl_account_category mdl_account_category = account_categoryRepository.findById(usersDTO.getAccount_category_id()).orElseThrow(() -> new ResourceNotFoundException("Category with id  " + usersDTO.getAccount_category_id() + " not found  "));
        accountRepository.saveAndFlush(new User(usersDTO.getUsername(), usersDTO.getPassword(), "", "enabled", mdl_account_category, mdl_profile));
        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

    @Operation(summary = "Creating a user account no gender")
    @PostMapping("/nogender")
    public ResponseEntity<?> addAccountNoGender(@RequestBody UsersDTO usersDTO) {
        System.out.println("----------------------------- WE are creatint an account");

        if (accountRepository.countByUsername(usersDTO.getUsername()) > 0) {
            return new ResponseEntity<>(new CustomErrorMessage("The username already exists"), HttpStatus.FOUND);
        } else {
            profileRepository.saveAndFlush(new Mdl_profile(usersDTO.getName(), usersDTO.getSurname()));
            Mdl_profile mdl_profile = profileRepository.findLastProfile();
            //-------------------get cetegory by id----------------------
            Mdl_account_category mdl_account_category = null;
            if (usersDTO.getAccount_category_id() == 0) {//this is the public user trying to create an account, in this way the account category is set manually
                //the user may be a user or a developer
                System.out.println("------------------ the user type is: " + usersDTO.getDevuser());
                if (null == usersDTO.getDevuser()) {
                    System.out.println("------------------ !!!!!Error - the user type , it should be either user or dev, but it is empty ");
                } else {
                    switch (usersDTO.getDevuser()) {
                        case "dev":
                            mdl_account_category = account_categoryRepository.findcategoryByName("dev");
                            break;
                        case "user":
                            mdl_account_category = account_categoryRepository.findcategoryByName("user");
                            break;
                        default:
                            System.out.println("------------------ !!!!! the user type is empty ");
                            break;
                    }
                }
            } else {
                mdl_account_category = account_categoryRepository.findById(usersDTO.getAccount_category_id()).orElseThrow(() -> new ResourceNotFoundException("Category with id  " + usersDTO.getAccount_category_id() + " not found  "));
            }
            //  save account
            accountRepository.saveAndFlush(new User(usersDTO.getUsername(), usersDTO.getPassword(), "", "enabled", mdl_account_category, mdl_profile));
        }
        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

//    @GetMapping("/{username}/{password}")
//    public ResponseEntity<User> Login(@PathVariable(name = "username") String username,
//            @PathVariable(name = "password") String password) {
//        User mdl_account = accountRepository.findAccountByUsernamePassword(username, password);
//        return new ResponseEntity<>(mdl_account, HttpStatus.OK);
//    }
    @PutMapping("/changePassword/{id}")
    public ResponseEntity<Map<String, Object>> changePassword(@PathVariable Long id, @RequestBody ChangePassword passDetails) {
        Map<String, Object> resp = new HashMap<>();
        User user = new User();
        System.out.println("------------password given: " + passDetails.getOldPassword() + " the username given: " + passDetails.getConfpassword());
        if (userRepository.findUserByPasswordandBYId(passDetails.getOldPassword(), passDetails.getId()) != null) {
            User userInfo = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("The account with the password  " + passDetails.getPassword() + " not found"));
            String usrnm = userInfo.getUsername();
            resp.put("resp", "foundAccountFoundpassword");
            //save in the database
            User account = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Account not exist with id:" + id));
            account.setPassword(passDetails.getConfpassword());
            user = accountRepository.save(account);
            resp.put("resp", user);

        } else if (accountRepository.findById(id) != null) {
            resp.put("resp", "OnlyFoundacc");
        } else {
            resp.put("resp", "noRec");
        }
        return ResponseEntity.ok(resp);

    }

    @PutMapping("/{id}/{profileId}/{catId}")
    public ResponseEntity<User> updateAccount(@PathVariable Long id, @RequestBody UsersDTO usersDTO, @PathVariable(name = "profileId") long profileId, @PathVariable(name = "catId") long catId) {

        System.out.println("------------------------------Updating the user well ----------------------------");
        // Record the start time
        long startTime = System.currentTimeMillis();

        User account = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Account not exist with id:" + id));
        Mdl_profile mdl_profile = profileRepository.findById(profileId).orElseThrow(() -> new ResourceNotFoundException("profile with id  " + profileId + " was not found"));
        Mdl_account_category mdl_account_category = account_categoryRepository.findById(catId).orElseThrow(() -> new ResourceNotFoundException("Category with id  " + profileId + " was not found"));
        mdl_profile.setName(usersDTO.getName());
        mdl_profile.setSurname(usersDTO.getSurname());
        mdl_profile.setGender(usersDTO.getGender());

        account.setMdl_account_category(mdl_account_category);
        account.setMdl_profile(mdl_profile);
        account.setUsername(usersDTO.getUsername());
        account.setPassword(usersDTO.getPassword());

        User Updated = accountRepository.save(account);
        System.currentTimeMillis();

        // Record the end time
        long endTime = System.currentTimeMillis();

        // Calculate the duration
        long duration = endTime - startTime;

        // Print the duration
        System.out.println("-----------------------Task took " + duration + " milliseconds.");

        return ResponseEntity.ok(Updated);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteAccount(@PathVariable("id") long id) {
        accountRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/update/{id}")//update the password
    public String updatePassword(@RequestBody Dto_updatePassword data, @PathVariable("id") Long id) {

        User account = accountRepository.findById(id).orElse(null);
        System.out.println(account.getPassword());
        if (data.getOldPassword().equals(account.getPassword())) {
            account.setPassword(data.getNewPassword());
            accountRepository.save(account);
        } else {
            return "old password  is incorect";
        }
        return "The password was reset successfully";

    }
}
