package solvd.structure;

import java.util.Objects;

public abstract class ContactInfo {
    private String phone;
    private String email;

    public ContactInfo(){

    }

    public ContactInfo(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return phone.equals(that.phone) && email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, email);
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
