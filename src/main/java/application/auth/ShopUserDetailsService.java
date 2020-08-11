package application.auth;

import application.model.ShopUser;
import application.service.ShopUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class ShopUserDetailsService implements UserDetailsService {

    @Autowired
    private ShopUserService shopUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        ShopUser user = shopUserService.findByUserName(s);
        if(user == null) {
            throw new UsernameNotFoundException("Nem létezik ilyen felhasználónév");
        }

        return new ShopUserPrincipal(user);
    }
}
