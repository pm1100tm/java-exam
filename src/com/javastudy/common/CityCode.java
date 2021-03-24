package com.javastudy.common;

public enum CityCode {

    SEOUL            (1835847, "1012001", "서울특별시", "서울", "11"),
    BUSAN            (1838519, "1012002", "부산광역시", "부산", "26"),
    DAEGU            (1835327, "1012003", "대구역시", "대구", "27"),
    INCHEON          (1843561, "1012004", "인천광역시", "인천", "28"),
    GWANGJU          (1841808, "1012005", "광주광역시", "광주", "29"),
    DAEJEON          (1835224, "1012006", "대전광역시", "대전", "30"),
    ULSAN            (1833742, "1012007", "울산광역시", "울산", "31"),
    SEJONG           (0, "1012008", "세종특별자치시", "세종특별자치시", "36"),
    GYEONGGIDO       (1841610, "1012009", "경기도", "경기", "41"),
    GANGWONDO        (1843125, "1012010", "강원도", "강원", "42"),
    CHUNGCHEONGBUKDO (1845106, "1012011", "충청북도", "충북", "43"),
    CHUNGCHEONGNAMDO (1845105, "1012012", "충청남도", "충남", "44"),
    JEOLLABUKDO      (1845789, "1012013", "전라북도", "전북", "45"),
    JEOLLANAMDO      (1845788, "1012014", "전라남도", "전남", "46"),
    GYEONGSANGBUKDO  (1841597, "1012015", "경상북도", "경북", "47"),
    GYEONGSANGNAMDO  (1902028, "1012016", "경상남도", "경남", "48"),
    JEJUDO           (1846265, "1012017", "제주도", "제주특별자치도", "50"),
    ETC              (0, null, "미정", "미정", "0");
    
    private final int cityId;
    private final String cityCode;
    private final String cityName;
    private final String cityPrefix;
    private final String cityPrefixCode;

    CityCode (int cityId, String cityCode, String cityName, String cityPrefix, String cityPrefixCode) {
        this.cityId = cityId;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.cityPrefix = cityPrefix;
        this.cityPrefixCode = cityPrefixCode;
    }

    public int getCityId () {
        return cityId;
    }

    public String getCityCode () {
        return cityCode;
    }

    public String getCityName () {
        return cityName;
    }

    public String getCityPrefix () {
        return cityPrefix;
    }

    public String getCityPrefixCode () {
        return cityPrefixCode;
    }
}
