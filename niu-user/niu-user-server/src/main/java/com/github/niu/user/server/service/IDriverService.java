package com.github.niu.user.server.service;

import com.github.niu.user.api.models.dto.DriverDTO;
import com.github.niu.user.api.models.vo.DriverVO;
import com.github.niu.user.server.models.Driver;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author System
 * @since 2019-05-03
 */
public interface IDriverService extends IService<Driver> {
    int createDriver(@NotNull DriverDTO dto) throws Exception;

    int certificationDriver(@NotNull Long id, @NotNull Byte status) throws Exception;

    List<DriverVO> getAll() throws Exception;

    DriverVO getByUserId(Long userId) throws Exception;
}
