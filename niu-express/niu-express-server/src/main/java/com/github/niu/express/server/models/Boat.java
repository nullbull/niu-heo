package com.github.niu.express.server.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
@Data
public class Boat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Byte smallCount;

    private Byte normalCount;

    private Byte largeCount;

    private BigDecimal smallPrice;

    private BigDecimal normalPrice;

    private BigDecimal largePrice;

    private Date createAt;

    private Date updateAt;

    private Long driverId;

    private String driverNickname;

    private String desc;

    private Date beginAt;

    private Date endAt;

    private Byte status;

    private String destinationName;

    private String companyName;

    private Byte companyId;

}
