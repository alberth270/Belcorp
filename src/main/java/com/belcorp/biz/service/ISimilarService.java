package com.belcorp.biz.service;

import com.belcorp.biz.expose.request.BaseRequest;
import com.belcorp.biz.expose.response.SimilarResponse;
import reactor.core.publisher.Mono;

public interface ISimilarService {

    Mono<SimilarResponse> calcularSimilarColors(BaseRequest similarRequest);
}
