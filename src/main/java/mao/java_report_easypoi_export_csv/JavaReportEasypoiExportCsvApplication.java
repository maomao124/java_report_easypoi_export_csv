package mao.java_report_easypoi_export_csv;

import mao.java_report_easypoi_export_csv.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaReportEasypoiExportCsvApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(JavaReportEasypoiExportCsvApplication.class, args);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.downloadCSV();
    }

}
