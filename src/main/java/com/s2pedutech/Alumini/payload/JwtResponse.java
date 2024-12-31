package com.s2pedutech.Alumini.payload;

import lombok.Generated;

public class JwtResponse {
    private String token;
    private String emailId;


    public static JwtResponseBuilder builder() {
        return new JwtResponseBuilder();
    }


    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof JwtResponse)) {
            return false;
        } else {
            JwtResponse other = (JwtResponse)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$token = this.getToken();
                Object other$token = other.getToken();
                if (this$token == null) {
                    if (other$token != null) {
                        return false;
                    }
                } else if (!this$token.equals(other$token)) {
                    return false;
                }

                Object this$emailId = this.getEmailId();
                Object other$emailId = other.getEmailId();
                if (this$emailId == null) {
                    if (other$emailId != null) {
                        return false;
                    }
                } else if (!this$emailId.equals(other$emailId)) {
                    return false;
                }

                return true;
            }
        }
    }


    protected boolean canEqual(final Object other) {
        return other instanceof JwtResponse;
    }


    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $token = this.getToken();
        result = result * 59 + ($token == null ? 43 : $token.hashCode());
        Object $emailId = this.getEmailId();
        result = result * 59 + ($emailId == null ? 43 : $emailId.hashCode());
        return result;
    }


    public JwtResponse() {
    }


    public JwtResponse(final String token, final String emailId) {
        this.token = token;
        this.emailId = emailId;
    }


    public String getToken() {
        return this.token;
    }


    public String getEmailId() {
        return this.emailId;
    }


    public void setToken(final String token) {
        this.token = token;
    }


    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }


    public String toString() {
        String var10000 = this.getToken();
        return "JwtResponse(token=" + var10000 + ", emailId=" + this.getEmailId() + ")";
    }


    public static class JwtResponseBuilder {

        private String token;

        private String emailId;


        JwtResponseBuilder() {
        }


        public JwtResponseBuilder token(final String token) {
            this.token = token;
            return this;
        }


        public JwtResponseBuilder emailId(final String emailId) {
            this.emailId = emailId;
            return this;
        }


        public JwtResponse build() {
            return new JwtResponse(this.token, this.emailId);
        }


        public String toString() {
            return "JwtResponse.JwtResponseBuilder(token=" + this.token + ", emailId=" + this.emailId + ")";
        }
    }
}