package com.codeguru_base;

import com.codeguru_base.jwtsecurity.User;
import com.codeguru_base.models.Mdl_account_category;
import com.codeguru_base.models.Mdl_profile;
import com.codeguru_base.repo.AccountRepository;
import com.codeguru_base.repo.Account_categoryRepository;
import com.codeguru_base.repo.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCaching
@RestController
public class GuruApplication implements CommandLineRunner {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    Account_categoryRepository account_categoryRepository;

    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(GuruApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcoe to CODEGURU Ltd";
    }

    @Override
    public void run(String... args) throws Exception {

        Mdl_profile mdlLastProfile = new Mdl_profile();
        User mdl_Account = new User();
        if (accountRepository.count() <= 0) {
            Mdl_account_category mdl_account_category = new Mdl_account_category();
            mdl_account_category.setName("admin");
//-------------------USER 1----------------------
            //Save category as admin
            account_categoryRepository.saveAndFlush(mdl_account_category);
            Mdl_account_category mdlLastCategory = account_categoryRepository.findLastcategory();
            profileRepository.saveAndFlush(new Mdl_profile("SANGWA", "Emmanuel", "Male", "0784113888", ""));
            mdlLastProfile = profileRepository.findLastProfile();
            mdl_Account = new User("sangwa", "1234", mdlLastProfile, mdlLastCategory, "enabled");
            accountRepository.saveAndFlush(mdl_Account);
//-------------------USER 2----------------------
            profileRepository.saveAndFlush(new Mdl_profile("Manager", "User", "Male", "", ""));
            mdlLastProfile = profileRepository.findLastProfile();
            account_categoryRepository.saveAndFlush(new Mdl_account_category("manager"));
            Mdl_account_category acc2 = account_categoryRepository.findcategoryByName("manager");
            mdl_Account = new User("manager", "123", mdlLastProfile, acc2, "enabled");
            accountRepository.saveAndFlush(mdl_Account);

            //-------------------USER 3----------------------
            profileRepository.saveAndFlush(new Mdl_profile("Dev", "dev", "Male", "", ""));
            mdlLastProfile = profileRepository.findLastProfile();
            account_categoryRepository.saveAndFlush(new Mdl_account_category("dev"));
            Mdl_account_category acc3 = account_categoryRepository.findcategoryByName("dev");
            mdl_Account = new User("manager", "123", mdlLastProfile, acc3, "enabled");
            accountRepository.saveAndFlush(mdl_Account);

//-------------------USER 3----------------------
            profileRepository.saveAndFlush(new Mdl_profile("user", "User", "Male", "", ""));
            mdlLastProfile = profileRepository.findLastProfile();
            account_categoryRepository.saveAndFlush(new Mdl_account_category("user"));
            Mdl_account_category acc4 = account_categoryRepository.findcategoryByName("user");
            mdl_Account = new User("user", "123", mdlLastProfile, acc4, "enabled");
            accountRepository.saveAndFlush(mdl_Account);

        }
//
    }

}
