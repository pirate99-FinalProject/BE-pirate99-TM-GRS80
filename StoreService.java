@Transactional
    public MsgResponseDto transGeo() {                                                                                  // DB 안의 STORE 테이블의 TM좌표 X,Y를 >> 위도,경도 X,Y좌표로 변환

        List<Store> transGeo = storeRepository.findAll();

            for (Store store : transGeo) {
                GeoPoint tmCoord = new GeoPoint(store.getXCoordinate(), store.getYCoordinate());
                GeoPoint geoCoord = convert(TM, GEO, tmCoord);

                store.updateXCoordinate(geoCoord.y);
                store.updateYCoordinate(geoCoord.x);
            }

        return new MsgResponseDto(STORE_UPDATE);
    }