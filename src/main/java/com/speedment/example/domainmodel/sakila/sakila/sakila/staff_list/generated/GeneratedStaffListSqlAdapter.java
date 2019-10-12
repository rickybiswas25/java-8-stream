package com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.StaffList;
import com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.StaffListImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.staff_list.StaffList}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStaffListSqlAdapter implements SqlAdapter<StaffList> {
    
    private final TableIdentifier<StaffList> tableIdentifier;
    
    protected GeneratedStaffListSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "staff_list");
    }
    
    protected StaffList apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(      resultSet.getShort(1 + offset))
            .setName(    resultSet.getString(2 + offset))
            .setAddress( resultSet.getString(3 + offset))
            .setZipCode( resultSet.getString(4 + offset))
            .setPhone(   resultSet.getString(5 + offset))
            .setCity(    resultSet.getString(6 + offset))
            .setCountry( resultSet.getString(7 + offset))
            .setSid(     resultSet.getShort(8 + offset))
            ;
    }
    
    protected StaffListImpl createEntity() {
        return new StaffListImpl();
    }
    
    @Override
    public TableIdentifier<StaffList> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, StaffList> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, StaffList> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}