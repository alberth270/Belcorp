package com.belcorp.biz.expose.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * <b>Class</b>: BaseRequest <br/>
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

@Schema(description = "BaseRequest")
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class BaseRequest {

    @Schema(name = "lapizLabial", example = "255, 204, 153")
    private String lapizLabial;

    @Schema(name = "mascara", example = "255, 204, 153")
    private String mascara;

    @Schema(name = "delineador", example = "255, 204, 153")
    private String delineador;

    @Schema(name = "rimel", example = "255, 204, 153")
    private String rimel;

}
