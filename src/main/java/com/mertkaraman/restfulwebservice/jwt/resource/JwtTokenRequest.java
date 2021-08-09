package com.mertkaraman.restfulwebservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    //token: eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtZXJ0IiwiZXhwIjoxNjI5MTA2NTU5LCJpYXQiOjE2Mjg1MDE3NTl9.e1WWZ5ElD17Uhz1bpbuFAKINegY6SY1ak0ktk3N-yTTT-0zHoroc6UNUEzvPWLnYX7lzGjfCWksRt_sOQYI5Cw

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

