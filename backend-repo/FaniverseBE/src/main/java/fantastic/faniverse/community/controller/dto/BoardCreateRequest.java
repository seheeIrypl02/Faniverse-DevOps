package fantastic.faniverse.community.controller.dto;

import fantastic.faniverse.community.domain.Board;
import lombok.Getter;

@Getter
public class BoardCreateRequest {
    private String name;

    public Board toEntity() {
        return Board.builder()
                .name(this.name)
                .build();
    }
}