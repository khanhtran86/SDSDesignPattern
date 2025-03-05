package com.samsung.firstspringboot.Common;

import org.springframework.stereotype.Component;

@Component
public class Utilities {
    public String HideEmail(String email) {
        return email.replaceAll("([a-z._-]+)([a-z._-]{4,})@([a-z]{3})([a-z.]+)",
                "$1****@***$4");
    }
}
