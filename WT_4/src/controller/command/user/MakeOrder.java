package controller.command.user;

import controller.command.Command;
import controller.command.CommandResult;
import exception.ServiceException;
import service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrder implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
