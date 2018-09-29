package com.revenant.javaweb.controller.api;

import com.revenant.javaweb.common.result.Result;
import com.revenant.javaweb.common.result.ResultEnum;
import com.revenant.javaweb.common.result.ResultUtil;
import com.revenant.javaweb.common.utils.UploadImgUtils;
import com.revenant.javaweb.pojo.Girl;
import com.revenant.javaweb.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private GirlService girlService;

    @GetMapping("/test")
    public Result test() {
//        return ResultUtil.success(girlService.selectAll());
        return ResultUtil.error(ResultEnum.DATA_IS_NULL);
    }

    @GetMapping("/testvo")
    public Result testVO() {
        return ResultUtil.success(girlService.list());
    }


    @PostMapping("/listpager")
    public Result listab(int pageNum, int pageSize) {
        return ResultUtil.success(girlService.pagerselectAll(pageNum, pageSize));
    }

    @PostMapping("/upload")
    public Result upload(@RequestParam(required = false, name = "file") MultipartFile[] file) {
        String imgUrl = null;
        try {
            imgUrl = UploadImgUtils.uploadFiles(file);
        } catch (Exception e) {
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR);
        }

        return ResultUtil.success(imgUrl);
    }
}
