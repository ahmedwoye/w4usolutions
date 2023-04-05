package com.albiscom.w4usolutions.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="carling_tbl")
public class Carling {

    @Id
    private Long id;
    private String surname;
    private String firstname;
    private String middlename;
}
