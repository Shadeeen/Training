package com.example.paginationn;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {
    UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public RespUserDTO createUser(@RequestBody RequestUserDTO user) {
       return userService.createUser(user);
    }

    @GetMapping
    public Page<RespUserDTO> getUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String[] sort
    ) {

        String sortField = sort[0];
        String sortDir = (sort.length > 1) ? sort[1] : "asc";

        Sort.Direction direction =
                sortDir.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;

        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(direction, sortField));

        return userService.getUsers(pageRequest);
    }


}
