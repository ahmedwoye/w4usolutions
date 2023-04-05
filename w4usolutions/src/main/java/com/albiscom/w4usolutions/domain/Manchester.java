package com.albiscom.w4usolutions.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="Manchester")
public class Manchester {

    @Id

    @SequenceGenerator(
            name = "manchester_sequence",
            sequenceName = "manchester_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "manchester_sequence"
    )

    @Column(name="manchester_id")
    private Long id;

    @Column(name="FirstName")
    private String firstname;

    @Column(name="Surname")
    private String surname;

    @Column(name="brpno")
    private String brpno;

    @CreationTimestamp
    @Column(name="created_at", nullable = false)
    private Date CreatedAt;

    @UpdateTimestamp
    @Column(name="updated_at")
    private Date UpdatedAt;
}
