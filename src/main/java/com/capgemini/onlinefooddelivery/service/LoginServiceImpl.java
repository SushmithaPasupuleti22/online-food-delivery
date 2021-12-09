/*
 * package com.capgemini.onlinefooddelivery.service;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.repository.CrudRepository; import
 * org.springframework.stereotype.Service; import
 * com.capgemini.onlinefooddelivery.exceptions.ValidateUserException; import
 * com.capgemini.onlinefooddelivery.model.Login; import
 * com.capgemini.onlinefooddelivery.repository.LoginRepository;
 * 
 * @Service public class LoginServiceImpl implements LoginService{
 * 
 * 
 * @Autowired LoginRepository loginRepo;
 * 
 * @Override
 * 
 * public Login signIn(Login login) { return loginRepo.saveAndFlush(login);
 * 
 * }
 * 
 * 
 * 
 * public Login signIn(Login loginDto) throws ValidateUserException {
 * //validateUser(loginDto); Login user = new Login();
 * user.setUserEmail(loginDto.getUserEmail());
 * //user.setPassword(BCryptPasswordEncoder.encode(loginDto.getPassword()));
 * user.setPassword(loginDto.getPassword()); user.setRole(loginDto.getRole());
 * return ((CrudRepository<Login, Integer>) loginDto).save(user); }
 * 
 * 
 * @Override public Login signOut(int userId) { Login
 * login1=loginRepo.findById(userId).get(); loginRepo.deleteById(userId); return
 * login1; }
 * 
 * @Override public Login signIn(Login loginDto) throws ValidateUserException {
 * // TODO Auto-generated method stub return null; }
 * 
 * }
 */