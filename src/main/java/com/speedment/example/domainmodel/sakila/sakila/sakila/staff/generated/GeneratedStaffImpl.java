package com.speedment.example.domainmodel.sakila.sakila.sakila.staff.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.address.Address;
import com.speedment.example.domainmodel.sakila.sakila.sakila.staff.Staff;
import com.speedment.example.domainmodel.sakila.sakila.sakila.store.Store;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.staff.Staff}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStaffImpl implements Staff {
    
    private short staffId;
    private String firstName;
    private String lastName;
    private int addressId;
    private Blob picture;
    private String email;
    private short storeId;
    private int active;
    private String username;
    private String password;
    private Timestamp lastUpdate;
    
    protected GeneratedStaffImpl() {}
    
    @Override
    public short getStaffId() {
        return staffId;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public int getAddressId() {
        return addressId;
    }
    
    @Override
    public Optional<Blob> getPicture() {
        return Optional.ofNullable(picture);
    }
    
    @Override
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
    
    @Override
    public short getStoreId() {
        return storeId;
    }
    
    @Override
    public int getActive() {
        return active;
    }
    
    @Override
    public String getUsername() {
        return username;
    }
    
    @Override
    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Staff setStaffId(short staffId) {
        this.staffId = staffId;
        return this;
    }
    
    @Override
    public Staff setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public Staff setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public Staff setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }
    
    @Override
    public Staff setPicture(Blob picture) {
        this.picture = picture;
        return this;
    }
    
    @Override
    public Staff setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public Staff setStoreId(short storeId) {
        this.storeId = storeId;
        return this;
    }
    
    @Override
    public Staff setActive(int active) {
        this.active = active;
        return this;
    }
    
    @Override
    public Staff setUsername(String username) {
        this.username = username;
        return this;
    }
    
    @Override
    public Staff setPassword(String password) {
        this.password = password;
        return this;
    }
    
    @Override
    public Staff setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Address findAddressId(Manager<Address> foreignManager) {
        return foreignManager.stream().filter(Address.ADDRESS_ID.equal(getAddressId())).findAny().orElse(null);
    }
    
    @Override
    public Store findStoreId(Manager<Store> foreignManager) {
        return foreignManager.stream().filter(Store.STORE_ID.equal(getStoreId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("staffId = "    + Objects.toString(getStaffId()));
        sj.add("firstName = "  + Objects.toString(getFirstName()));
        sj.add("lastName = "   + Objects.toString(getLastName()));
        sj.add("addressId = "  + Objects.toString(getAddressId()));
        sj.add("picture = "    + Objects.toString(OptionalUtil.unwrap(getPicture())));
        sj.add("email = "      + Objects.toString(OptionalUtil.unwrap(getEmail())));
        sj.add("storeId = "    + Objects.toString(getStoreId()));
        sj.add("active = "     + Objects.toString(getActive()));
        sj.add("username = "   + Objects.toString(getUsername()));
        sj.add("password = "   + Objects.toString(OptionalUtil.unwrap(getPassword())));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "StaffImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Staff)) { return false; }
        final Staff thatStaff = (Staff)that;
        if (this.getStaffId() != thatStaff.getStaffId()) { return false; }
        if (!Objects.equals(this.getFirstName(), thatStaff.getFirstName())) { return false; }
        if (!Objects.equals(this.getLastName(), thatStaff.getLastName())) { return false; }
        if (this.getAddressId() != thatStaff.getAddressId()) { return false; }
        if (!Objects.equals(this.getPicture(), thatStaff.getPicture())) { return false; }
        if (!Objects.equals(this.getEmail(), thatStaff.getEmail())) { return false; }
        if (this.getStoreId() != thatStaff.getStoreId()) { return false; }
        if (this.getActive() != thatStaff.getActive()) { return false; }
        if (!Objects.equals(this.getUsername(), thatStaff.getUsername())) { return false; }
        if (!Objects.equals(this.getPassword(), thatStaff.getPassword())) { return false; }
        if (!Objects.equals(this.getLastUpdate(), thatStaff.getLastUpdate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getStaffId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getLastName());
        hash = 31 * hash + Integer.hashCode(getAddressId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPicture()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getEmail()));
        hash = 31 * hash + Short.hashCode(getStoreId());
        hash = 31 * hash + Integer.hashCode(getActive());
        hash = 31 * hash + Objects.hashCode(getUsername());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPassword()));
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}