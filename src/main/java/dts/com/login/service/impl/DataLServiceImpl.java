package dts.com.login.service.impl;

import dts.com.login.entity.DataL;
import dts.com.login.respository.DataLRespository;
import dts.com.login.service.DataLService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataLServiceImpl implements DataLService {
    private final DataLRespository dataLRespository;

    public DataLServiceImpl(DataLRespository dataLRespository) {this.dataLRespository = dataLRespository;}

    @Override
    public DataL createD(DataL dataL) {
        return dataLRespository.save(dataL);
    }

    @Override
    public List<DataL> selecteAll() {
        return dataLRespository.findAll();
    }
}
