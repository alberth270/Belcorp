package com.belcorp.biz.service.impl;

import com.belcorp.biz.expose.request.BaseRequest;
import com.belcorp.biz.expose.response.SimilarResponse;
import com.belcorp.biz.service.ISimilarService;
import com.belcorp.biz.util.SimilarColor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SimilarServiceImpl implements ISimilarService {

    @Override
    public Mono<SimilarResponse> calcularSimilarColors(BaseRequest similarRequest) {
        List<String> lapizLabial = Arrays.stream(similarRequest.getLapizLabial().split(","))
                .map(String::trim).toList();
        List<String> mascara = Arrays.stream(similarRequest.getMascara().trim().split(","))
                .map(String::trim).toList();
        List<String> delineador = Arrays.stream(similarRequest.getDelineador().trim().split(","))
                .map(String::trim).toList();
        List<String> rimel = Arrays.stream(similarRequest.getRimel().trim().split(","))
                .map(String::trim).toList();
        return Mono.just(SimilarResponse.builder()
                .lapizLabial(calcularSimilarColor(lapizLabial))
                .delineador(calcularSimilarColor(delineador))
                .mascara(calcularSimilarColor(mascara))
                .rimel(calcularSimilarColor(rimel))
                .build());
    }

    private List<String> calcularSimilarColor(List<String> colorEvaluar) {
        List<int[]> colors = new ArrayList<>();
        colors.add(new int[]{255, 0, 0});    // Rojo
        colors.add(new int[]{0, 255, 0});    // Verde
        colors.add(new int[]{0, 0, 255});    // Azul
        colors.add(new int[]{255, 255, 0});  // Amarillo
        colors.add(new int[]{255, 165, 0});  // Naranja
        colors.add(new int[]{128, 0, 0});    // Marrón
        colors.add(new int[]{255, 192, 203}); // Rosa
        List<int[]> response = SimilarColor.findMostSimilarColor(colorEvaluar, colors, 3);
        return response.stream()
                .map(resultado -> resultado[0] + ", "+ resultado[1] + ", "+ resultado[2])
                .toList();
    }

}
