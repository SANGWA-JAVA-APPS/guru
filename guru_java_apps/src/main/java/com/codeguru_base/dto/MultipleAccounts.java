 

package com.codeguru_base.dto;


import com.codeguru_base.jwtsecurity.User;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author SANGWA Emmanuel code [CODEGURU - info@codeguru.com]
 */
@Setter @Getter
public class MultipleAccounts {

    List<User> multiAccounts;
}

