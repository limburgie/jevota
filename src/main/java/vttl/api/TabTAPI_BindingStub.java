/**
 * TabTAPI_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package vttl.api;

public class TabTAPI_BindingStub extends org.apache.axis.client.Stub implements vttl.api.TabTAPI_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Test");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TestRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">TestRequest"), vttl.api.TestRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">TestResponse"));
        oper.setReturnClass(vttl.api.TestResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TestResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSeasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetSeasonsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetSeasonsRequest"), vttl.api.GetSeasonsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetSeasonsResponse"));
        oper.setReturnClass(vttl.api.GetSeasonsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetSeasonsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClubTeams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetClubTeamsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubTeamsRequest"), vttl.api.GetClubTeamsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubTeamsResponse"));
        oper.setReturnClass(vttl.api.GetClubTeamsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetClubTeamsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDivisionRanking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetDivisionRankingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingRequest"), vttl.api.GetDivisionRankingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingResponse"));
        oper.setReturnClass(vttl.api.GetDivisionRankingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetDivisionRankingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMatches");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMatchesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesRequest"), vttl.api.GetMatchesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesResponse"));
        oper.setReturnClass(vttl.api.GetMatchesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMatchesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMembersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersRequest"), vttl.api.GetMembersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersResponse"));
        oper.setReturnClass(vttl.api.GetMembersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMembersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Upload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">UploadRequest"), vttl.api.UploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">UploadResponse"));
        oper.setReturnClass(vttl.api.UploadResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "UploadResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClubs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetClubs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubs"), vttl.api.GetClubs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubsResponse"));
        oper.setReturnClass(vttl.api.GetClubsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetClubsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDivisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetDivisions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisions"), vttl.api.GetDivisions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionsResponse"));
        oper.setReturnClass(vttl.api.GetDivisionsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetDivisionsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTournaments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetTournaments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetTournaments"), vttl.api.GetTournaments.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetTournamentsResponse"));
        oper.setReturnClass(vttl.api.GetTournamentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetTournamentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMatchSystems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMatchSystems"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchSystems"), vttl.api.GetMatchSystems.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchSystemsResponse"));
        oper.setReturnClass(vttl.api.GetMatchSystemsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GetMatchSystemsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public TabTAPI_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TabTAPI_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TabTAPI_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubs");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetClubs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetClubsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubTeamsRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetClubTeamsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetClubTeamsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetClubTeamsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetDivisionRankingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionRankingResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetDivisionRankingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisions");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetDivisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetDivisionsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetDivisionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMatchesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchesResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMatchesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchSystems");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMatchSystems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMatchSystemsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMatchSystemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMembersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetMembersResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetMembersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetSeasonsRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetSeasonsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetSeasonsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetSeasonsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetTournaments");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetTournaments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">GetTournamentsResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.GetTournamentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">TestRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.TestRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">TestResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.TestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">UploadRequest");
            cachedSerQNames.add(qName);
            cls = vttl.api.UploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", ">UploadResponse");
            cachedSerQNames.add(qName);
            cls = vttl.api.UploadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "AddressType");
            cachedSerQNames.add(qName);
            cls = vttl.api.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ClubEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.ClubEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "CredentialsType");
            cachedSerQNames.add(qName);
            cls = vttl.api.CredentialsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "DivisionEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.DivisionEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "GenderType");
            cachedSerQNames.add(qName);
            cls = vttl.api.GenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "IndividualMatchResultEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.IndividualMatchResultEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MatchSystemEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.MatchSystemEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "MemberEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.MemberEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PhoneType");
            cachedSerQNames.add(qName);
            cls = vttl.api.PhoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "PlayerResultEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.PlayerResultEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.RankingEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "RankingPointEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.RankingPointEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ResultType");
            cachedSerQNames.add(qName);
            cls = vttl.api.ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SeasonEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.SeasonEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "ShowDivisionNameType");
            cachedSerQNames.add(qName);
            cls = vttl.api.ShowDivisionNameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "SupportedLanguages");
            cachedSerQNames.add(qName);
            cls = vttl.api.SupportedLanguages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDefinitionEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchDefinitionEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDetailsEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchDetailsEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchDoubleTeamEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchDoubleTeamEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchPlayerEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TeamMatchPlayerListType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TeamMatchPlayerListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "TournamentEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.TournamentEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.frenoy.net/TabTAPI", "VenueEntryType");
            cachedSerQNames.add(qName);
            cls = vttl.api.VenueEntryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public vttl.api.TestResponse test(vttl.api.TestRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Test");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Test"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.TestResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.TestResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.TestResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetSeasonsResponse getSeasons(vttl.api.GetSeasonsRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetSeasons");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSeasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetSeasonsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetSeasonsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetSeasonsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetClubTeamsResponse getClubTeams(vttl.api.GetClubTeamsRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetClubTeams");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClubTeams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetClubTeamsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetClubTeamsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetClubTeamsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetDivisionRankingResponse getDivisionRanking(vttl.api.GetDivisionRankingRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetDivisionRanking");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDivisionRanking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetDivisionRankingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetDivisionRankingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetDivisionRankingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetMatchesResponse getMatches(vttl.api.GetMatchesRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMatches");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMatches"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetMatchesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetMatchesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetMatchesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetMembersResponse getMembers(vttl.api.GetMembersRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMembers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetMembersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetMembersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetMembersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.UploadResponse upload(vttl.api.UploadRequest body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("Upload");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Upload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.UploadResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.UploadResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.UploadResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetClubsResponse getClubs(vttl.api.GetClubs body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetClubs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClubs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetClubsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetClubsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetClubsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetDivisionsResponse getDivisions(vttl.api.GetDivisions body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetDivisions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDivisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetDivisionsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetDivisionsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetDivisionsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetTournamentsResponse getTournaments(vttl.api.GetTournaments body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetTournaments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTournaments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetTournamentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetTournamentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetTournamentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public vttl.api.GetMatchSystemsResponse getMatchSystems(vttl.api.GetMatchSystems body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GetMatchSystems");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMatchSystems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (vttl.api.GetMatchSystemsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (vttl.api.GetMatchSystemsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, vttl.api.GetMatchSystemsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
