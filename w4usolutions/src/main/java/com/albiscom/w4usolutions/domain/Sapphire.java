package com.albiscom.w4usolutions.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="sapphire_tbl")
public class Sapphire {


    @Id

    @SequenceGenerator(
            name= "sapphire_sequence",
            sequenceName = "sapphire_sequence",
            allocationSize = 1
    )

    @GeneratedValue(

            strategy = GenerationType.SEQUENCE,
            generator = "sapphire_sequence"
    )

    private Long id;
    private String surname;
    private String firstname;
    private String training;
}
