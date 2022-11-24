package com.property.propertymanagement.service.impl;

import com.property.propertymanagement.converter.UserConverter;
import com.property.propertymanagement.dto.UserDTO;
import com.property.propertymanagement.entity.UserEntity;
import com.property.propertymanagement.exception.BusinessException;
import com.property.propertymanagement.exception.ErrorModel;
import com.property.propertymanagement.repository.UserRepository;
import com.property.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    // 1- get the User repository so we can interact with the DB
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO register(UserDTO userDTO) {
        // check with the repo if the email exist or not
        Optional<UserEntity> optUe = userRepository.findByOwnerEmail(userDTO.getOwnerEmail());
        if(optUe.isPresent()){
            // use the error model and business exception to return exception
            List<ErrorModel> errorModelList = new ArrayList<>();
            ErrorModel errorModel = new ErrorModel();
            errorModel.setCode("EMAIL_ALREADY_EXIST");
            errorModel.setMessage("The Email With Which You Are Trying To Register Already Exist!");
            errorModelList.add(errorModel);
            throw new BusinessException(errorModelList);
        }

        UserEntity userEntity = userConverter.convertDTOtoEntity(userDTO);
        userEntity = userRepository.save(userEntity);

//        AddressEntity addressEntity = new AddressEntity();
//        addressEntity.setHouseNo(userDTO.getHouseNo());
//        addressEntity.setCity(userDTO.getCity());
//        addressEntity.setPostalCode(userDTO.getPostalCode());
//        addressEntity.setStreet(userDTO.getStreet());
//        addressEntity.setCountry(userDTO.getCountry());
//        addressEntity.setUserEntity(userEntity);
        //addressRepository.save(addressEntity);

        userDTO = userConverter.convertEntityToDTO(userEntity);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password) {
        UserDTO userDTO = null;
        Optional<UserEntity>  optionalUserEntity =  userRepository.findByOwnerEmailAndPassword(email, password);
        if (optionalUserEntity.isPresent()){
            userDTO = userConverter.convertEntityToDTO(optionalUserEntity.get());
        }else{
            // new errors list created from the error model
            List<ErrorModel> errorModelList = new ArrayList<>();
            // create one error model because if the login fail its only one error
            ErrorModel errorModel = new ErrorModel();
            // set error code to Invalid Login
            errorModel.setCode("INVALID_LOGIN");
            // set message to this message
            errorModel.setMessage("Incorrect Email or Password");
            // add the single error to the list of errors created at first step
            errorModelList.add(errorModel);
            // throw the error in case of else
            throw new BusinessException(errorModelList);
        }
        return userDTO;
    }
}
