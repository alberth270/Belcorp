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
 * <b>Class</b>: Client <br/>
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
@Table(name = "Client")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENT", nullable = true)
    private Integer idClient;

    @Column(name = "COD_CLIENT")
    private String codClient;

    @Column(name = "COD_COUNTRY")
    private String codCountry;

    @Column(name = "DATE_CREATION",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar creationDate;

    @Column(name = "NAME_CLIENT")
    private String nameClient;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATE_UPDATE",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updateDate;

    @Column(name = "ADDRESS")
    private String address;
}
