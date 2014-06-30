#import <Foundation/Foundation.h>

@interface YPObject : NSObject

@property(nonatomic) NSString* _idObj;
@property(nonatomic) BOOL isLoaded;

- (id) initWithValues:(NSDictionary*)dict;
- (id) initWithObjectId: (NSString*)dict;
- (NSDictionary*) asDictionary;
@end
