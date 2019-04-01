package com.chase.kvm.test.cli;

import org.apache.felix.gogo.commands.Action;
import org.apache.felix.service.command.CommandSession;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "lm", name = "printHello", description = "Print Hello")
public class LMPrintHello implements Action {
    @Override
    public Object execute(CommandSession commandSession) throws Exception {
        System.out.println("Hello command.");
        return null;
    }
}
