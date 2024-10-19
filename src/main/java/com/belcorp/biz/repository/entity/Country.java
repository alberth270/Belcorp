package com.belcorp.biz.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <b>Class</b>: Country <br/>
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
@Table(name = "Country")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Country implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COUNTRY")
    private Long idCountry;

    @Column(name = "CODE_COUNTRY")
    private String codeCountry;

    @Column(name = "DES_COUNTRY")
    private String desCountry;
}
