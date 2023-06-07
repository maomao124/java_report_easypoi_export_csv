package mao.java_report_easypoi_export_csv.service.impl;

import cn.afterturn.easypoi.csv.CsvExportUtil;
import cn.afterturn.easypoi.csv.entity.CsvExportParams;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import mao.java_report_easypoi_export_csv.entity.User;
import mao.java_report_easypoi_export_csv.mapper.UserMapper;
import mao.java_report_easypoi_export_csv.service.UserService;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.util.List;

/**
 * Project name(项目名称)：java_report_easypoi_export_csv
 * Package(包名): mao.java_report_easypoi_export_csv.service.impl
 * Class(类名): UserServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/7
 * Time(创建时间)： 14:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService
{

    @Override
    public void downloadCSV()
    {
        log.info("开始导出csv文件");
        try (FileOutputStream fileOutputStream = new FileOutputStream("./out4.csv"))
        {
            //查询
            List<User> userList = this.page(new Page<>(0, 10000)).getRecords();
            CsvExportParams params = new CsvExportParams();
            params.setEncoding(CsvExportParams.UTF8);
            //表头
            //params.setExclusions(new String[]{"编号", "姓名", "手机号", "入职日期", "地址"});
            CsvExportUtil.exportCsv(params, User.class, userList, fileOutputStream);
            log.info("csv文件导出完成");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
