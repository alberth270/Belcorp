package com.belcorp.biz.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Calendar;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <b>Class</b>: Consultant <br/>
 * <b>Copyright</b>: 2024 BELCORP <br/>.
 *
 * @author 2023  BELCORP <br/>
 * <u>Service Provider</u>: BELCORP <br/>
 * <u>Developed by</u>: BELCORP <br/>
 * <u>Changes:</u><br/>
 * <ul>
 *   <li>
 *     Octubre 18, 2024  Creación de Clase.
 *   </li>
 * </ul>
 */

@Entity
@Table(name = "Consultant")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consultant implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONSULTANT_ID")
    private Integer idConsultant;

    @Column(name = "COD_COUNTRY")
    private String codCountry;

    @Column(name = "COD_BELIST")
    private String codBeList;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "PATERNAL_SURNAME")
    private String paternalSurname;

    @Column(name = "NUMBER_DOCUMENT")
    private String numberDocument;

    @Column(name = "TYPE_DOCUMENT")
    private String typeDocument;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "ENTRY_CAMPAIGN")
    private String entryCampaign;

    @Column(name = "BIRTHDATE",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birthDate;

    @Column(name = "REGISTRATION_DATE",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar registrationDate;
}
