package ssau.kuznetsov.autotests.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssau.kuznetsov.autotests.repos.PassportRepo;

@RestController
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private PassportRepo passRep;

    @GetMapping("truncate/passport")
    public void truncatePassport() {
        passRep.deleteAll();
    }
}