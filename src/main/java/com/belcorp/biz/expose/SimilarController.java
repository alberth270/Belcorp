package com.belcorp.biz.expose;

import com.belcorp.biz.expose.request.BaseRequest;
import com.belcorp.biz.expose.response.SimilarResponse;
import com.belcorp.biz.service.ISimilarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <b>Class</b>: SimilarController <br/>
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
@RestController
@RequestMapping("/product")
public class SimilarController {

    @Autowired
    private ISimilarService similarService;

    /**
     * This method is used to get all ProductModel.
     * @return all ProductModel.
     */
    @PostMapping()
    @Operation(
            operationId = "PostSimilarColor",
            summary = "Obtener colores similares.",
            description = "Endpoint para obtener colores similares",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful operation",
                            content = @Content(schema = @Schema(implementation = SimilarResponse.class))
                    )
            })
    private Mono<SimilarResponse> getAllProduct(
            @RequestBody BaseRequest similarRequest){

        return similarService.calcularSimilarColors(similarRequest);
    }

}
