package dts.com.login.service;

import dts.com.login.entity.DataL;
import dts.com.login.respository.DataLRespository;

import java.util.List;

public interface DataLService {
   DataL createD(DataL dataL);
   List<DataL> selecteAll();
}
