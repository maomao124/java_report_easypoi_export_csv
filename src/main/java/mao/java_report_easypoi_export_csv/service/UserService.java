package mao.java_report_easypoi_export_csv.service;

import com.baomidou.mybatisplus.extension.service.IService;
import mao.java_report_easypoi_export_csv.entity.User;

/**
 * Project name(项目名称)：java_report_easypoi_export_csv
 * Package(包名): mao.java_report_easypoi_export_csv.service
 * Interface(接口名): UserService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/7
 * Time(创建时间)： 14:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface UserService extends IService<User>
{
    /**
     * 下载csv
     */
    void downloadCSV();
}
