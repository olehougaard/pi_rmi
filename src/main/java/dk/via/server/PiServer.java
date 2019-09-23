package dk.via.server;

import dk.via.math.PiResult;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PiServer extends Remote {
    PiResult computePi(int digits) throws RemoteException;
}
