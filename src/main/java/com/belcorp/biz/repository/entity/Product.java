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
 * <b>Class</b>: Product <br/>
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
@Table(name = "Product")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_SAP")
    private Long codSap;

    @Column(name = "DES_PRODUCT")
    private String desProduct;

    @Column(name = "DES_UNI_BUSSINESS")
    private String desUniBussiness;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "GRUP_ART")
    private String grupArt;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "LENGTH_PROD")
    private String lengthProd;

    @Column(name = "WIDTH_PROD")
    private String widthProd;

    @Column(name = "VOLUME_PROD")
    private String volumeProd;

    @Column(name = "GROSS_WEIGHT")
    private String grossWeight;
}
