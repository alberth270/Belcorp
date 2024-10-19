package com.belcorp.biz.expose.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

/**
 * <b>Class</b>: SimilarResponse <br/>
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

@Schema(description = "SimilarResponse")
@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Setter
@ToString
public class SimilarResponse {
    @Schema(name = "lapizLabial", example = "1")
    private List<String> lapizLabial;

    @Schema(name = "mascara", example = "255, 204, 153")
    private List<String> mascara;

    @Schema(name = "delineador", example = "255, 204, 153")
    private List<String> delineador;

    @Schema(name = "rimel", example = "255, 204, 153")
    private List<String> rimel;
}
