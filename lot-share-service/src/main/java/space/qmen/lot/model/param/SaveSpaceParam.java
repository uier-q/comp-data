package space.qmen.lot.model.param;

import lombok.Data;

@Data
public class SaveSpaceParam {

    // 车位编码
    private String code;
    private String name;

    // 车位面积
    private Double spaceArea;
    private String description;

    // 小区id
    private Long fCommunityId;

    // 车位id
    private Long fOwnerId;
}
