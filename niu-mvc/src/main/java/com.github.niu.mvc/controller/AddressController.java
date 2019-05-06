package com.github.niu.mvc.controller;

import com.alibaba.fastjson.JSON;
import com.github.niu.user.api.models.dto.AddressDTO;
import com.github.niu.user.api.service.IAddressRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author 牛贞昊（niuzhenhao@58.com）
 * @date 2019/5/6 10:50
 * @desc
 */
@RequestMapping("/address")
@RestController
public class AddressController {
    @Autowired
    IAddressRemote addressRemote;

    @RequestMapping(value = "/doAdd", method = RequestMethod.POST)
    public String add(@Valid @RequestBody AddressDTO dto) throws Exception {
        return JSON.toJSONString(addressRemote.add(dto));
    }

    @RequestMapping(value = "/getByUser/{id}")
    public String getByUserId(@PathVariable("id") Long id) throws Exception {
        return JSON.toJSONString(addressRemote.getUserId(123L));
    }

    @RequestMapping("/default/{id}")
    public int setDefault(@PathVariable("id") Long id) throws Exception {
        return addressRemote.setDefault(id);
    }

    @RequestMapping("/normal/{id}")
    public int setNormal(@Valid @PathVariable("id") Long id) throws Exception {
        return addressRemote.setNormal(id);
    }

    @RequestMapping("/doDelete/{id}")
    public int delete(@Valid @PathVariable("id") Long id) throws Exception {
        return addressRemote.delete(id);
    }

}
