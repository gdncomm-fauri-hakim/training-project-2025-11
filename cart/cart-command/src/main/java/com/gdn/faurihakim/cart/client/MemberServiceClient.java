package com.gdn.faurihakim.cart.client;

import com.blibli.oss.backend.common.model.response.Response;
import com.gdn.faurihakim.cart.client.model.GetMemberResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "member-service", url = "${member.service.url}")
public interface MemberServiceClient {

    @GetMapping("/api/members")
    Response<GetMemberResponse> getMember(@RequestParam("email") String email);
}
