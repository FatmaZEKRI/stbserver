package fr.univ.rouen.stbserver.Service;


import fr.univ.rouen.stbserver.model.Detail;


public interface IDetailService {
	public Detail saveDetail(Detail dt);
	public Detail update(Detail dt);
	public void deleteDetail(Integer dtId);


}
