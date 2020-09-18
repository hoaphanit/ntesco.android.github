package com.vn.ntesco.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 j2\u00020\u0001:\u0001jJ)\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0018H\'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a2\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a2\u0006\u0002\u0010 Jc\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0019\b\u0001\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b&0#2\u000e\b\u0001\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110(2\u0013\b\u0001\u0010)\u001a\r\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b&0*2\u0013\b\u0001\u0010+\u001a\r\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b&0*H\'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010-\u001a\u00020\u0006H\'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0003H\'J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0003H\'J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u0003H\'J\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010@\u001a\u00020$2\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0003H\'J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u0003H\'J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u0003H\'J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020B0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\'J\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020B0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010R\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0003H\'J\u0018\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\'J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0\u0003H\'J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010]\u001a\u00020^H\'JC\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010`\u001a\u00020\u00062\u0019\b\u0001\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b&0#2\u000e\b\u0001\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110(H\'JC\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010`\u001a\u00020\u00062\u0019\b\u0001\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\t\u0012\u00070%\u00a2\u0006\u0002\b&0#2\u000e\b\u0001\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110(H\'J\u0018\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J\u0018\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010e\u001a\u00020fH\'J\u0018\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'J\u000e\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\'\u00a8\u0006k"}, d2 = {"Lcom/vn/ntesco/network/NTescoService;", "", "assignReport", "Lrx/Observable;", "Lcom/vn/ntesco/model/Response/NTescoResponse;", "id", "", "assignRequest", "Lcom/vn/ntesco/model/Request/AssignRequest;", "(Ljava/lang/Integer;Lcom/vn/ntesco/model/Request/AssignRequest;)Lrx/Observable;", "calculatorLiquidChemicals", "Lcom/vn/ntesco/model/Response/CalculatorChemicalsResponse;", "nTescoRequestPOST", "Lcom/vn/ntesco/model/Request/NTescoRequestPOST;", "calculatorPowderChemicals", "changeAvatar", "image", "Lokhttp3/MultipartBody$Part;", "changePassword", "Lcom/vn/ntesco/model/Response/UserResponse;", "signupRequest", "Lcom/vn/ntesco/model/Request/SignupRequest;", "checkList", "checkListRequest", "Lcom/vn/ntesco/model/Request/CheckListRequest;", "checkVersion", "Lcom/vn/ntesco/model/Response/CheckVersionResponse;", "nTescoRequestGET", "Lcom/vn/ntesco/model/Request/NTescoRequestGET;", "completeReport", "(Ljava/lang/Integer;Lcom/vn/ntesco/model/Request/NTescoRequestPOST;)Lrx/Observable;", "confirmReport", "(Ljava/lang/Integer;)Lrx/Observable;", "createReport", "params", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "imgList", "", "rawWaterTypes", "", "products", "deleteNotification", "notificationId", "getAboutUs", "Lcom/vn/ntesco/model/Response/AboutUsResponse;", "getAllListWork", "Lcom/vn/ntesco/model/Response/ReportResponse;", "getBanners", "Lcom/vn/ntesco/model/Response/BannerResponse;", "getCategoriesSolution", "Lcom/vn/ntesco/model/Response/CategoryResponse;", "getCheckLists", "Lcom/vn/ntesco/model/Response/CheckListResponse;", "getChemicals", "Lcom/vn/ntesco/model/Response/ChemicalsResponse;", "getDetailNotification", "Lcom/vn/ntesco/model/Response/DetailNotificationResponse;", "getDetailPost", "Lcom/vn/ntesco/model/Response/DetailPostResponse;", "getDetailReport", "Lcom/vn/ntesco/model/Response/ReportDetailReponse;", "report", "getFormsProcessing", "Lcom/vn/ntesco/model/Response/RawWaterTypeResponse;", "getGuarantees", "getListTechnicals", "Lcom/vn/ntesco/model/Response/ListTechnicalResponse;", "getMyListWork", "getNotifications", "Lcom/vn/ntesco/model/Response/NotificationResponse;", "getOffices", "Lcom/vn/ntesco/model/Response/OfficesResponse;", "getPost", "Lcom/vn/ntesco/model/Response/PostResponse;", "getProduct", "getProductDetail", "Lcom/vn/ntesco/model/Response/ProductDetailResponse;", "getProfile", "getRawWaterType", "getReport", "getSchedules", "Lcom/vn/ntesco/model/Response/ScheduleResponse;", "getSocialNetworks", "Lcom/vn/ntesco/model/Response/SocialResponse;", "getSolutionProducts", "Lcom/vn/ntesco/model/Response/SolutionProductResponse;", "getTotalNotifyUnread", "Lcom/vn/ntesco/model/Response/TotalNotifyUnreadResponse;", "logOut", "login", "loginRequest", "Lcom/vn/ntesco/model/Request/LoginRequest;", "processedReport", "reportId", "processingStatusReport", "resetPassword", "sendContact", "sendMessage", "messageRequest", "Lcom/vn/ntesco/model/Request/MessageRequest;", "signup", "switchLanguage", "updateProfile", "Companion", "app_debug"})
public abstract interface NTescoService {
    public static final com.vn.ntesco.network.NTescoService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String path = "/api/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String report = "/api/report/";
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/chemicals")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ChemicalsResponse> getChemicals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/calculation/calculator-powder")
    public abstract rx.Observable<com.vn.ntesco.model.Response.CalculatorChemicalsResponse> calculatorPowderChemicals(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.NTescoRequestPOST nTescoRequestPOST);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/calculation/calculator-liquid")
    public abstract rx.Observable<com.vn.ntesco.model.Response.CalculatorChemicalsResponse> calculatorLiquidChemicals(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.NTescoRequestPOST nTescoRequestPOST);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/pages/get-page")
    public abstract rx.Observable<com.vn.ntesco.model.Response.AboutUsResponse> getAboutUs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/login")
    public abstract rx.Observable<com.vn.ntesco.model.Response.UserResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.LoginRequest loginRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/signup")
    public abstract rx.Observable<com.vn.ntesco.model.Response.UserResponse> signup(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.SignupRequest signupRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/offices")
    public abstract rx.Observable<com.vn.ntesco.model.Response.OfficesResponse> getOffices(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/customer/index")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ReportResponse> getReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/employee/list-work")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ReportResponse> getAllListWork(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/employee/my-list-work")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ReportResponse> getMyListWork(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/option-raw-water-types")
    public abstract rx.Observable<com.vn.ntesco.model.Response.RawWaterTypeResponse> getRawWaterType(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/option-products")
    public abstract rx.Observable<com.vn.ntesco.model.Response.RawWaterTypeResponse> getProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/detail-report/{report}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ReportDetailReponse> getDetailReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "report")
    java.lang.String report, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/notifications")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NotificationResponse> getNotifications(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/notifications/{notificationId}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.DetailNotificationResponse> getDetailNotification(@retrofit2.http.Path(value = "notificationId")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/posts")
    public abstract rx.Observable<com.vn.ntesco.model.Response.PostResponse> getPost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/posts/{Id}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.DetailPostResponse> getDetailPost(@retrofit2.http.Path(value = "Id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/categories")
    public abstract rx.Observable<com.vn.ntesco.model.Response.CategoryResponse> getCategoriesSolution();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/products/{product}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ProductDetailResponse> getProductDetail(@retrofit2.http.Path(value = "product")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/products")
    public abstract rx.Observable<com.vn.ntesco.model.Response.SolutionProductResponse> getSolutionProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/schedules")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ScheduleResponse> getSchedules(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/get-profile")
    public abstract rx.Observable<com.vn.ntesco.model.Response.UserResponse> getProfile();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/api/update-profile")
    public abstract rx.Observable<com.vn.ntesco.model.Response.UserResponse> updateProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.SignupRequest signupRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/api/change-password")
    public abstract rx.Observable<com.vn.ntesco.model.Response.UserResponse> changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.SignupRequest signupRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/api/report/confirm/{reportId}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> confirmReport(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "reportId")
    java.lang.Integer id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/report/completed/{reportId}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> completeReport(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "reportId")
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.NTescoRequestPOST nTescoRequestPOST);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/banners")
    public abstract rx.Observable<com.vn.ntesco.model.Response.BannerResponse> getBanners(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/reset-password")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> resetPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.SignupRequest signupRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/send-contact")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> sendContact(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.SignupRequest signupRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/api/switch-language")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> switchLanguage();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/notifications/count-unread")
    public abstract rx.Observable<com.vn.ntesco.model.Response.TotalNotifyUnreadResponse> getTotalNotifyUnread();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/logout")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> logOut();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/messages")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> sendMessage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.MessageRequest messageRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/social-networks")
    public abstract rx.Observable<com.vn.ntesco.model.Response.SocialResponse> getSocialNetworks();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/handle-formalities")
    public abstract rx.Observable<com.vn.ntesco.model.Response.RawWaterTypeResponse> getFormsProcessing();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/technicals")
    public abstract rx.Observable<com.vn.ntesco.model.Response.ListTechnicalResponse> getListTechnicals();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/api/report/assigned/{reportId}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> assignReport(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "reportId")
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.AssignRequest assignRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/check-version")
    public abstract rx.Observable<com.vn.ntesco.model.Response.CheckVersionResponse> checkVersion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    com.vn.ntesco.model.Request.NTescoRequestGET nTescoRequestGET);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.DELETE(value = "/api/notifications/{notificationId}")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> deleteNotification(@retrofit2.http.Path(value = "notificationId")
    int notificationId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/report/send")
    @retrofit2.http.Multipart()
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> createReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imgList, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "raw_water_type[]")
    java.util.List<okhttp3.RequestBody> rawWaterTypes, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "products[]")
    java.util.List<okhttp3.RequestBody> products);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/report/processing-status/{reportId}")
    @retrofit2.http.Multipart()
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> processingStatusReport(@retrofit2.http.Path(value = "reportId")
    int reportId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imgList);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/report/processed/{reportId}")
    @retrofit2.http.Multipart()
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> processedReport(@retrofit2.http.Path(value = "reportId")
    int reportId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> params, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imgList);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/change-avatar")
    @retrofit2.http.Multipart()
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> changeAvatar(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/checklists")
    public abstract rx.Observable<com.vn.ntesco.model.Response.CheckListResponse> getCheckLists();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/checklists")
    public abstract rx.Observable<com.vn.ntesco.model.Response.NTescoResponse> checkList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.vn.ntesco.model.Request.CheckListRequest checkListRequest);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/guarantees")
    public abstract rx.Observable<com.vn.ntesco.model.Response.RawWaterTypeResponse> getGuarantees();
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vn/ntesco/network/NTescoService$Companion;", "", "()V", "path", "", "report", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String path = "/api/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String report = "/api/report/";
        
        private Companion() {
            super();
        }
    }
}