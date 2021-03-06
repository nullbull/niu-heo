package com.github.niu.common.constants;

import com.github.niu.common.enums.SiteEnum;
import org.apache.commons.beanutils.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/4/23 15:31
 * @desc
 */
public interface Constants {

    Byte EXPRESS_STATUS_NEW  = 1;

    Byte EXPRESS_STATUS_PICK_UP = 2;

    Byte EXPRESS_STATUS_FINISHED  = 3;

    Byte EXPRESS_STATUS_DEL = 0;

    Byte ADDRESS_STATUS_DEFAULT = 1;

    Byte ADDRESS_STATUS_SECOND = 2;

    Byte ADDRESS_STATUS_DELETE = 0;

    List<Byte> ADDRESS_STATUS_LIST = Arrays.asList(ADDRESS_STATUS_DEFAULT, ADDRESS_STATUS_SECOND, ADDRESS_STATUS_DELETE);
    Byte BOAT_STATUS_NEW  = 1;

    Byte BOAT_STATUS_PROCESS = 2;

    Byte BOAT_STATUS_END = 3;

    Byte BOAT_STATUS_FINISHED = 4;

    Byte TICKET_STATUS_NEW = 1;

    Byte TICKET_STATUS_CANCEL = 2;

    Byte TICKET_STATUS_FINISHED = 3;

    Byte USER_TYPE_NORMAL = 1;

    Byte USER_TYPE_DRIVER = 2;

    Byte DRIVER_STATUS_NEW  = 1;

    Byte DRIVER_STATUS_ALLOWED = 2;

    Byte DRIVER_STATUS_FORBIDDEN = 3;

    Byte PACKAGE_TYPE_SMALL = 1;

    Byte PACKAGE_TYPE_MIDDLE = 2;

    Byte PACKAGE_TYPE_LARGE = 3;

    String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=wxd8351139e225250e&secret=7e5a4a965f162e2f89ef5d83959af666&js_code=%s&grant_type=authorization_code";

    String WX_CODE_KEY = "wx:code:";

    List<SiteVO> siteVOList = Arrays.stream(SiteEnum.values()).map(e -> {
        SiteVO siteVO = new SiteVO();
        siteVO.setTitle(e.getName());
        siteVO.setValue(e.getCode());
        return siteVO;
    }).collect(Collectors.toList());
}
