package test;

import utils.HttpUtils;

import java.net.URISyntaxException;
import java.util.Objects;

public class DownloadSchedule {

    public static void main(String[] args) throws URISyntaxException {


        //拉取排班
        String deptId = "1041300016212529";
        String doctId = "1041300100639635";
        String hospitalId = "10413";
        String channelCode = "TS003";
        String startDate = "2020-01-22";
        String endDate = "2020-04-18";

        String resp = HttpUtils.generateRequest("http://localhost:9090/register_manager/open/schedule/getScheduleByDept")
                .addParam("deptId", deptId)
                .addParam("doctId", doctId)
                .addParam("hospitalId", hospitalId)
                .addParam("channelCode", channelCode)
                .addParam("StartDate", startDate)
                .addParam("endDate", endDate)
                .doPost();
        System.out.println(resp);

        if (Objects.isNull(resp)) {
            return;
        }

        //拉取号源
        

        //挂号


        //锁号


    }
}
