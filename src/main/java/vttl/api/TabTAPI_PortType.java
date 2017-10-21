/**
 * TabTAPI_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public interface TabTAPI_PortType extends java.rmi.Remote {
    public vttl.api.TestResponse test(vttl.api.TestRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetSeasonsResponse getSeasons(vttl.api.GetSeasonsRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetClubTeamsResponse getClubTeams(vttl.api.GetClubTeamsRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetDivisionRankingResponse getDivisionRanking(vttl.api.GetDivisionRankingRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetMatchesResponse getMatches(vttl.api.GetMatchesRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetMembersResponse getMembers(vttl.api.GetMembersRequest body) throws java.rmi.RemoteException;
    public vttl.api.UploadResponse upload(vttl.api.UploadRequest body) throws java.rmi.RemoteException;
    public vttl.api.GetClubsResponse getClubs(vttl.api.GetClubs body) throws java.rmi.RemoteException;
    public vttl.api.GetDivisionsResponse getDivisions(vttl.api.GetDivisions body) throws java.rmi.RemoteException;
    public vttl.api.GetTournamentsResponse getTournaments(vttl.api.GetTournaments body) throws java.rmi.RemoteException;
    public vttl.api.GetMatchSystemsResponse getMatchSystems(vttl.api.GetMatchSystems body) throws java.rmi.RemoteException;
}
