package com.github.niu.express.server.service.impl;

import com.github.niu.common.constants.Constants;
import com.github.niu.express.api.models.dto.TicketDTO;
import com.github.niu.express.server.service.ITicketService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/5 21:24
 * @desc
 */
public class TicketServiceImplTest extends BaseTest{

    @Autowired
    ITicketService iTicketService;
    @Test
    public void createTicket() throws Exception {
        TicketDTO ticketDTO = new TicketDTO();
        ticketDTO.setUserId(123L);
        ticketDTO.setBoatId(1555432152510L);
        ticketDTO.setPackageType(Constants.PACKAGE_TYPE_SMALL);
        ticketDTO.setPrice(new BigDecimal("1.1"));
        ticketDTO.setLeavePhone("2345");
        ticketDTO.setCode("1023");
        ticketDTO.setExpressType((byte) 1);
        ticketDTO.setLeaveName("张炜婷");
        Assert.assertEquals(1, iTicketService.createTicket(ticketDTO));
    }

    @Test
    public void getByUserId() throws Exception {
//        Assert.assertNotNull(iTicketService.getByUserId(1555664209091L));、
        iTicketService.getByUserId(1555664209091L).stream().forEach(System.out::println);
    }

    @Test
    public void changeStatus() throws Exception {
        Assert.assertEquals(1, iTicketService.changeStatus(1555521139372L, Constants.TICKET_STATUS_FINISHED));
    }

    @Test
    public void  getPassenger() throws Exception {
        iTicketService.getPassenger(1555664209091L).forEach(System.out::println);
    }

    @Test
    public void getByBoatId() throws Exception {
        iTicketService.getTicketByBoatId(1555432152599L).forEach(System.out::println);
    }
}
