package com.codeguru_base.jwtsecurity;

import com.codeguru_base.models.Mdl_account_category;
import com.codeguru_base.models.Mdl_profile;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;
    private String email;
    //This is status that shows if the user is enable or disabled
    private String status;

    @ManyToOne
    @JoinColumn(name = "account_category_id")
    private Mdl_account_category mdl_account_category;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Mdl_profile mdl_profile;

    public User(String username, String password, Mdl_profile mdl_profile, Mdl_account_category mdl_account_category, String status) {
        this.username = username;
        this.password = password;
        this.mdl_profile = mdl_profile;
        this.mdl_account_category = mdl_account_category;
        this.status = status;
    }

    public User(String username, String password, String email, Mdl_account_category mdl_account_category, Mdl_profile mdl_profile) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.mdl_account_category = mdl_account_category;
        this.mdl_profile = mdl_profile;
    }

    public User(String username, String password, String email, String status, Mdl_account_category mdl_account_category, Mdl_profile mdl_profile) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.mdl_account_category = mdl_account_category;
        this.mdl_profile = mdl_profile;
    }

}
