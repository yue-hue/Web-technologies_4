package controller.command.common;

import controller.command.Command;
import controller.command.CommandResult;
import exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartPage implements Command {

    private static final String LOGIN_PAGE = "/index.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}