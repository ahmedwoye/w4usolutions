package com.albiscom.w4usolutions.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
//import org.springframework.data.annotation.Id;
import javax.persistence.Id;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="staff_tbl")
public class staff {

    @Id
    @GeneratedValue

    private Long id;
    private String surname;
    private String firstname;
    private String department;
}
