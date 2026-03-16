package com.leonardomachado.workshop_mongo.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leonardomachado.workshop_mongo.dto.UserDto;
import com.leonardomachado.workshop_mongo.entities.User;
import com.leonardomachado.workshop_mongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService serv;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDto>> findAll() {
		List<User> list = serv.findAll();
		List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
}
