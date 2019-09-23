package dk.via.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunServer {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(1099);
        PiServerImplementation server = new PiServerImplementation();
        registry.rebind("PiServer", server);
        System.out.println("Server running");
    }
}
